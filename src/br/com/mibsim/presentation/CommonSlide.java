package br.com.mibsim.presentation;

import br.com.etyllica.context.Application;
import br.com.etyllica.core.graphics.Graphic;
import br.com.etyllica.layer.ImageLayer;

public class CommonSlide extends Application {

	private ImageLayer background;
	
	public CommonSlide(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {

		background = new ImageLayer("bg.png");
		
		loading = 100;
	}

	@Override
	public void draw(Graphic g) {
		background.draw(g);
	}

}
