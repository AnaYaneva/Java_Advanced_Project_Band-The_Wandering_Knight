package tiles.stone_wall;

import gfx.Assets;
import tiles.Tile;

//GRASS TILE
public class Stone_wall_down1 extends Tile {

    public Stone_wall_down1(int id) {
        super(Assets.stone_wall_down1, id);
    }

    @Override
    public boolean isSolid(){
        return true;
    }

}
