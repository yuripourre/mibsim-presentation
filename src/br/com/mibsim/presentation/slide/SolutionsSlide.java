package br.com.mibsim.presentation.slide;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;
import br.com.mibsim.presentation.slide.proposal.ProposalSlide;

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
		drawSentence(g, 0, "Robôs autônomos colaborativos");
		
		//Separar como objetivos
		drawSentence(g, 1, "Economia de bateria (menos retrabalho)");
		drawSentence(g, 2, "Integração com novos indivíduos");
	}
		
	@Override
	public void nextSlide() {
		nextApplication = new ProposalSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new ProblemsSlide(w, h);
	}

}
