package group04.projectilecommon;

import group04.common.Entity;

public class ProjectileEntity extends Entity {

    private boolean explosive;
    private int explosionRadius;
    private Entity shotFrom;
    private float angle;
    private float destructionTimer;
    private String destroyProjectileAudio;

    public float getDestructionTimer() {
        return destructionTimer;
    }

    public void setDestructionTimer(float destructionTimer) {
        this.destructionTimer = destructionTimer;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public Entity getShotFrom() {
        return shotFrom;
    }

    public void setShotFrom(Entity shotFrom) {
        this.shotFrom = shotFrom;
    }

    public boolean isExplosive() {
        return explosive;
    }

    public void setExplosive(boolean explosive) {
        this.explosive = explosive;
    }

    public int getExplosionRadius() {
        return explosionRadius;
    }

    public void setExplosionRadius(int explosionRadius) {
        this.explosionRadius = explosionRadius;
    }

    public String getDestroyProjectileAudio() {
        return destroyProjectileAudio;
    }

    public void setDestroyProjectileAudio(String destroyProjectileAudio) {
        this.destroyProjectileAudio = destroyProjectileAudio;
    }

}
