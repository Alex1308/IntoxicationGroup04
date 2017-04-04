package group04.common;


import java.util.HashMap;
import java.util.UUID;

public class Entity {

    private EntityType entityType;
    private float x;
    private float y;
    private UUID ID = UUID.randomUUID();
    private float[] shapeX;
    private float[] shapeY;
    private float velocity;
    private float verticalVelocity;
    private boolean hasGravity;
    private String drawable;
    private String currentAnimation;
    private String runAnimation;
    private String idleAnimation;
    private String jumpAnimation;
    private String attackAnimation;
    private boolean animateable = false;
    private double currentFrame;
    private boolean grounded;
    private int life;
    private int maxLife;    

    public String getRunAnimation() {
        return runAnimation;
    }

    public void setRunAnimation(String runAnimation) {
        this.runAnimation = runAnimation;
    }

    public String getIdleAnimation() {
        return idleAnimation;
    }

    public void setIdleAnimation(String idleAnimation) {
        this.idleAnimation = idleAnimation;
    }

    public String getJumpAnimation() {
        return jumpAnimation;
    }

    public void setJumpAnimation(String jumpAnimation) {
        this.jumpAnimation = jumpAnimation;
    }

    public String getAttackAnimation() {
        return attackAnimation;
    }

    public void setAttackAnimation(String attackAnimation) {
        this.attackAnimation = attackAnimation;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public boolean isGrounded() {
        return grounded;
    }

    public void setGrounded(boolean grounded) {
        this.grounded = grounded;
    }

    public String getCurrentAnimation() {
        if(currentAnimation != null)
            return currentAnimation.toLowerCase();
        else
            return null;
    }

    public void setCurrentAnimation(String currentAnimation) {
        this.currentAnimation = currentAnimation;
    }

    public boolean isAnimateable() {
        return animateable;
    }

    public void setAnimateable(boolean animateable) {
        this.animateable = animateable;
    }

    public double getCurrentFrame() {
        return currentFrame;
    }

    public void setCurrentFrame(double currentFrame) {
        this.currentFrame = currentFrame;
    }

    public String getDrawable() {
        if(drawable != null)
            return drawable.toLowerCase();
        else
            return null;
    }

    public void setDrawable(String drawable) {
        this.drawable = drawable;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public float getVerticalVelocity() {
        return verticalVelocity;
    }

    public void setVerticalVelocity(float verticalVelocity) {
        this.verticalVelocity = verticalVelocity;
    }

    public boolean isHasGravity() {
        return hasGravity;
    }

    public void setHasGravity(boolean hasGravity) {
        this.hasGravity = hasGravity;
    }

    public float[] getShapeX() {
        return shapeX;
    }

    public void setShapeX(float[] shapeX) {
        this.shapeX = shapeX;
    }

    public float[] getShapeY() {
        return shapeY;
    }

    public void setShapeY(float[] shapeY) {
        this.shapeY = shapeY;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getID() {
        return ID.toString();
    }
}
