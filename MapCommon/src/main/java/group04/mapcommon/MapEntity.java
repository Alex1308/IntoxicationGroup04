/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group04.mapcommon;

import group04.common.Entity;

/**
 *
 * @author burno
 */
public class MapEntity extends Entity {

    private int[][] map;

    public int[][] getMap() {
        return map;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }

}