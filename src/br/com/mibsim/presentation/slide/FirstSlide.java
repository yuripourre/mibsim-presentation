package br.com.mibsim.presentation.slide;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;

public class FirstSlide extends CommonSlide {
	
	public FirstSlide(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
		super.load();
		
		loading = 100;
	}
	
	@Override
	public void draw(Graphic g) {
		super.draw(g);
				
		drawTitle(g);
		drawSubTitle(g);
	}
	
	protected void drawTitle(Graphic g) {
		g.setFontSize(100);
		g.drawStringBorderX("MibSim", 200);
	}
	
	protected void drawSubTitle(Graphic g) {
		g.setFontSize(66);
		g.drawStringBorderX("Um processo de colaboração", 310);
		g.drawStringBorderX("entre robôs autônomos", 390);
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new MotivationSlide(w, h);	
	}

}
