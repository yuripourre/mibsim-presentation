package br.com.mibsim.presentation.slide;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;
import br.com.mibsim.presentation.slide.proposal.ProposalSlide;

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
		drawSentence(g, 3, "Gasto excessivo de bateria");
	}
		
	@Override
	public void nextSlide() {
		nextApplication = new ProposalSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new UsageSlide(w, h);
	}

}
