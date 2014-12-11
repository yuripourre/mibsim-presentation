package br.com.mibsim.presentation;

import java.awt.Color;
import java.awt.Font;

import br.com.etyllica.context.Application;
import br.com.etyllica.core.event.GUIEvent;
import br.com.etyllica.core.event.KeyEvent;
import br.com.etyllica.core.graphics.Graphic;
import br.com.etyllica.core.loader.FontLoader;
import br.com.etyllica.layer.ImageLayer;

public class CommonSlide extends Application implements Slide {

	protected Font font;
	
	private ImageLayer background;
	
	public CommonSlide(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
		
		font = FontLoader.getInstance().loadFont("Suplexmentary_Comic_NC.ttf");

		background = new ImageLayer("bg.png");
		
		loading = 10;
	}

	@Override
	public void draw(Graphic g) {
		background.draw(g);
		
		setupFont(g);
	}
	
	private void setupFont(Graphic g) {
		g.setFont(font);
		g.setBasicStroke(6f);
		g.setShadowColor(Color.BLACK);
		g.setColor(Color.WHITE);
	}

	@Override
	public GUIEvent updateKeyboard(KeyEvent event) {
		if(event.isAnyKeyDown(KeyEvent.TSK_SPACE, KeyEvent.TSK_RIGHT_ARROW, KeyEvent.TSK_JOYSTICK_RIGHT))
			nextSlide();
		
		else if(event.isAnyKeyDown(KeyEvent.TSK_LEFT_ARROW, KeyEvent.TSK_JOYSTICK_LEFT))
			previousSlide();
		
		return GUIEvent.NONE;
	}
	
	protected void drawTitle(Graphic g, String text) {
		g.setFontSize(80);
		g.drawStringBorderX(text, 110);
	}
	
	protected void drawSentence(Graphic g, double index, String text) {
		g.setFontSize(40);
		g.drawStringBorderX(text, 210+(int)(70*index));
	}
	
	@Override
	public void nextSlide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void previousSlide() {
		// TODO Auto-generated method stub
		
	}

}
