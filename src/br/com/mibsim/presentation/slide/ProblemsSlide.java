package br.com.mibsim.presentation.slide;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;

public class ProblemsSlide extends CommonSlide {
	
	public ProblemsSlide(int w, int h) {
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
				
		drawTitle(g, "Problemas enfrentados");
		drawSentence(g, 0, "Robôs não colaborativos");
		drawSentence(g, 1, "Redundância nos caminhos");
		drawSentence(g, 2, "Dificuldade em assimilar novos indivíduos");
	}
		
	@Override
	public void nextSlide() {
		nextApplication = new SolutionsSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new UsageSlide(w, h);
	}

}
