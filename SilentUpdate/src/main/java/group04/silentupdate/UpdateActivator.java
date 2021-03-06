package group04.silentupdate;

/**
 *
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.openide.modules.ModuleInstall;
import org.openide.util.Exceptions;

/**
 * Manages a module's lifecycle. Remember that an installer is optional and
 * often not needed at all.
 */
public class UpdateActivator extends ModuleInstall {

    private final ScheduledExecutorService exector = Executors.newScheduledThreadPool(1);

    @Override
    public void restored() {
        FileInputStream in = null;
        try {
            try {
                String userdir = System.getProperty("user.dir");
                if ("intoxication".equals(userdir.substring(userdir.length() - "intoxication".length(), userdir.length()))) {

                } else {
                    System.setProperty("user.dir", System.getProperty("user.dir") + "/target/intoxication");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            File bundleFile = new File(System.getProperty("user.dir")).getParentFile().getParentFile().getParentFile();
            String propsPath = bundleFile.getAbsolutePath() + "/SilentUpdate/src/main/resources/group04/silentupdate/";
            in = new FileInputStream(propsPath + "Bundle.properties");
            Properties props = new Properties();
            props.load(in);
            in.close();
            FileOutputStream out = new FileOutputStream(propsPath + "Bundle.properties");
            File file = new File(System.getProperty("user.dir")).getParentFile().getParentFile();
            String s = "file:///" + file.getPath().replaceAll(" ", "%20") + "/updatecenter/netbeans_site/updates.xml";
            props.setProperty("group04_silentupdate_update_center", s);
            props.store(out, null);
            out.close();
            exector.scheduleAtFixedRate(doCheck, 5000, 5000, TimeUnit.MILLISECONDS);
        } catch (FileNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }

    private static final Runnable doCheck = new Runnable() {
        @Override
        public void run() {
            if (UpdateHandler.timeToCheck()) {
                UpdateHandler.checkAndHandleUpdates();
            }
        }

    };

    @Override
    public void uninstalled() {
        super.uninstalled(); //To change body of generated methods, choose Tools | Templates.
    }

}
