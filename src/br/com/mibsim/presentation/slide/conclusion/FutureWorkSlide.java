package br.com.mibsim.presentation.slide.conclusion;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;

public class FutureWorkSlide extends CommonSlide {
	
	public FutureWorkSlide(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
		quantity = 160;
		
		super.load();
		
		loading = 100;
	}	
	
	@Override
	public void draw(Graphic g) {
		super.draw(g);
				
		drawTitle(g, "Trabalhos futuros");
		drawSentence(g, 0, "Permitir que agentes possam se reproduzir;");
		drawSentence(g, 1, "Levar o MibSim para o mundo real,");
		drawSentence(g, 2, "utilizando-o em robôs autônomos;");
	}
	
	@Override
	public void nextSlide() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new LimitationSlide(w, h);
	}

}
