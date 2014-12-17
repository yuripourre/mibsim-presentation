package br.com.mibsim.presentation.slide.poi;

import java.util.ArrayList;
import java.util.List;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.building.basement.Basement;
import br.com.mibsim.building.basement.HydraliskBasement;
import br.com.mibsim.building.basement.LurkerBasement;
import br.com.mibsim.building.basement.UltraliskBasement;
import br.com.mibsim.presentation.CommonSlide;

public class BasementsSlide extends CommonSlide {
	
	private List<Basement> basements = new ArrayList<Basement>();
	
	public BasementsSlide(int w, int h) {
		super(w, h);
	}
	
	@Override
	public void load() {
		super.load();
		
		basements.add(new LurkerBasement(220, 130));
		basements.add(new HydraliskBasement(640, 200));
		basements.add(new UltraliskBasement(280, 480));
				
		loading = 100;
	}	
	
	@Override
	public void draw(Graphic g) {
		super.draw(g);
		
		for(Basement basement: basements)
			basement.draw(g, 0, 0);
		
		drawTitle(g, "Bases estratégicas");
		drawSentence(g, 1, "Cada espécie possui sua própria base.");
		drawSentence(g, 2, "Elas serve como repositório de conhecimento;");
		drawSentence(g, 3, "O conhecimento dos agentes sobre a posição das");
		drawSentence(g, 4, "fontes é intermediado pelas bases estratégicas.");
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new FountainsSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new SpeciesSlide(w, h);
	}

}
