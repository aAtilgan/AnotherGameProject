package model;

import org.newdawn.slick.SlickException;

public class Enemy extends Moving{

	public Enemy(int character_id) throws SlickException {
		super(character_id);
		setShiftX(520);
		setShiftY(520);
		setSpeed(.1f);
	}

}
