import java.math.BigDecimal;

public class Schnittpunkt extends Punkt {

	private Gerade mutterGerade_eins;
	private Gerade mutterGerade_zwei;

	public Schnittpunkt(BigDecimal x, BigDecimal y, Gerade g1, Gerade g2) {
		super(x, y);
		setMutterGerade_eins(g1);
		setMutterGerade_zwei(g2);
	}

	public Gerade getMutterGerade_eins() {
		return mutterGerade_eins;
	}

	public void setMutterGerade_eins(Gerade mutterGerade_eins) {
		this.mutterGerade_eins = mutterGerade_eins;
	}

	public Gerade getMutterGerade_zwei() {
		return mutterGerade_zwei;
	}

	public void setMutterGerade_zwei(Gerade mutterGerade_zwei) {
		this.mutterGerade_zwei = mutterGerade_zwei;
	}

}
