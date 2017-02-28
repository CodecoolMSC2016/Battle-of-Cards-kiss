package cardgame;

public enum Cars {
	DaimlerSix(1, 230),
	FordGranada(2, 172),
	LamborghiniCountach(3, 295),
	OpelMonza(4, 215),
	VWGolf2(5, 167),
	AudiQuattro(6, 230),
	VolgaM24(7, 145),
	Zastava1100Confort(8, 143),
	Peugeot205GTI(9, 206),
	BMW525(10, 197),
	LotusEspritTurbo(11, 245),
	Trabant601(12, 110),
	PolskiFiat126(13, 105),
	ChevroletCamaro(14, 205),
	LanciaDeltaIntegrale(15, 220),
	FordSierra(16, 152),
	ChevriketCorvette(17, 205),
	HondaPrelude(18, 165),
	LadaNiva(19, 130),
	MercedesBenzW124(20, 180),
	ToyotaMR2(21, 197),
	BMWM6(22, 245),
	MazdaMX5(23, 175),
	Skoda130Rapid(24, 141),
	FiatX19(25, 180),
	Dacia1300(26, 145),
	Porche928(27, 255),
	BitterCD(28, 220),
	SuzukiSamurai(29, 130),
	Saab900Turbo(30, 195),
	Tatra613(31, 190),
	AlfaRomeoGTV6(32, 230);

	int id;
	int tSpeed;

	private Cars(int id, int tSpeed) {
		this.id = id;
		this.tSpeed = tSpeed;
	}

	public int getId() {
		return id;
	}

	public String toString(){
		return "" + this.name() + ", " + id + ", " + tSpeed;
	}
	
}
