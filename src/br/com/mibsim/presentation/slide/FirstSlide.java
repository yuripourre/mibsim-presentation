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
		g.setFontSize(130);
		g.drawStringBorderX("MibSim", 150);
	}
	
	protected void drawSubTitle(Graphic g) {
		g.setFontSize(66);
		g.drawStringBorderX("Um processo de colaboração", 290);
		g.drawStringBorderX("entre robôs autônomos", 360);
		
		g.setFontSize(44);
		g.drawStringBorder("Yuri Vitor Pourre", 80,  510);
		
		g.setFontSize(32);
		g.drawStringBorder("Orientadora:", 600,  460, 400, 20);
		g.drawStringBorder("Kate Cerqueira Revoredo", 600,  500, 400, 20);
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new MotivationSlide(w, h);	
	}

}
