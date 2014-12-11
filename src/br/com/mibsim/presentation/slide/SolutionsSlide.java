package br.com.mibsim.presentation.slide;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;

public class SolutionsSlide extends CommonSlide {
	
	public SolutionsSlide(int w, int h) {
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
				
		drawTitle(g, "Solução");
		drawSentence(g, 0, "Rede de aspiradores colaborativos");
		drawSentence(g, 1, "Integração com novos indivíduos");
	}
		
	@Override
	public void nextSlide() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new ProblemsSlide(w, h);
	}

}
