package cn.nukkit.event.entity;

import cn.nukkit.entity.Entity;
import cn.nukkit.event.HandlerList;
import cn.nukkit.math.Vector3;

public class EntityMoveEvent extends EntityEvent {
    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlers() {
        return handlers;
    }

    private final double dx;
    private final double dy;
    private final double dz;

    public EntityMoveEvent(Entity entity, double dx, double dy, double dz) {
        this.entity = entity;
        this.dx = dx;
        this.dy = dy;
        this.dz = dz;
    }

    public Vector3 getVector() {
        return new Vector3(dx, dy, dz);
    }

    public double getDx() {
        return this.dx;
    }


    public double getDy() {
        return this.dx;
    }


    public double getDz() {
        return this.dx;
    }
}
