import br.com.etyllica.EtyllicaFrame;
import br.com.etyllica.context.Application;
import br.com.etyllica.core.loader.JoystickLoader;
import br.com.mibsim.presentation.FirstSlide;


public class Presentation extends EtyllicaFrame {

	private static final long serialVersionUID = 1L;

	public Presentation() {
		super(1024, 576);
	}
	
	public static void main(String[] args) {
		Presentation presentation = new Presentation();
		presentation.init();		
	}	

	@Override
	public Application startApplication() {

		String s = Presentation.class.getResource("").toString();
		setPath(s+"../");
		
		JoystickLoader.getInstance().init(1);
		
		return new FirstSlide(w,h);
	}

}
