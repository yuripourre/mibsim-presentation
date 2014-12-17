package br.com.mibsim.presentation.slide.conclusion;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;

public class LimitationSlide extends CommonSlide {
	
	public LimitationSlide(int w, int h) {
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
				
		drawTitle(g, "Limitações");
		drawSentence(g, 0, "O algoritmo de movimentação dos agentes");
		drawSentence(g, 1, "não considera obstáculos.");
		drawSentence(g, 2, "Os agentes só podem ter um tipo de nutriente.");
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new FutureWorkSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new ConclusionSlide(w, h);
	}

}
