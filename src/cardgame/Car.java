package cardgame;

public enum Car {
	DaimlerSix(1, 230, 1708, 3980, 6, 7.4, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0027.JPG"),
	FordGranada(2, 172, 1205, 2293, 6, 12.4, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0004.JPG"),
	LamborghiniCountach(3, 295, 1490, 5167, 12, 4.9, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0019.JPG"),
	OpelMonza(4, 215, 1385, 2969, 6, 8.5,"/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0022.JPG"),
	VWGolf2(5, 167, 870, 1595, 4, 11.3, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0010.JPG"),
	AudiQuattro(6, 230, 1350, 2226, 5, 7.1, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0005.JPG"),
	VolgaM24(7, 145, 1300, 2445, 4, 23.0, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0003.JPG"),
	Zastava1100Confort(8, 143, 802, 1116, 4, 16.8,"/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0029.JPG"),
	Peugeot205GTI(9, 206, 860, 1905, 4, 7.8,"/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0023.JPG"),
	BMW525(10, 197, 1290, 2494, 6, 9.9,"/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0024.JPG"),
	LotusEspritTurbo(11, 245, 1220, 2174, 4, 5.6,"/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0021.JPG"),
	Trabant601(12, 110, 610, 595, 2, 36.8, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0009.JPG"),
	PolskiFiat126(13, 105, 600, 652, 2, 38.0,"/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0025.JPG"),
	ChevroletCamaro(14, 205, 1600, 5675, 8, 11.0, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0007.JPG"),
	LanciaDeltaIntegrale(15, 220, 1260, 1995, 4, 5.7, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0032.JPG"),
	FordSierra(16, 152, 997, 1294, 4, 18.1,"/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0015.JPG"),
	ChevroletCorvette(17, 205, 1600, 5400, 8, 7.0, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0002.JPG"),
	HondaPrelude(18, 165, 920, 1602, 4, 11.5, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0018.JPG"),
	LadaNiva(19, 130, 1065, 1568, 4, 23.0,"/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0028.JPG"),
	MercedesBenzW124(20, 180, 1490, 2996, 6, 14.6, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0031.JPG"),
	ToyotaMR2(21, 197, 975, 1587, 4, 8.7, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0006.JPG"),
	BMWM6(22, 245, 1583, 3453, 6, 6.5, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0014.JPG"),
	MazdaMX5(23, 175, 965, 1598, 4, 10.6, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0017.JPG"),
	Skoda130Rapid(24, 141, 915, 1174, 4, 16.5, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0013.JPG"),
	FiatX19(25, 180, 914, 1498, 4, 10.4, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0008.JPG"),
	Dacia1300(26, 145, 890, 1297, 4, 16.5, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0033.JPG"),
	Porche928(27, 255, 1450, 4664, 8, 6.2,"/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0026.JPG"),
	BitterCD(28, 220, 1750, 5400, 8, 9.9,"/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0030.JPG"),
	SuzukiSamurai(29, 130, 930, 1298, 4, 14.9,"/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0011.JPG"),
	Saab900Turbo(30, 195, 1240, 1985, 4, 9.0, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0020.JPG"),
	Tatra613(31, 190, 1600, 3495, 8, 12.7, "/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0012.JPG"),
	AlfaRomeoGTV6(32, 230, 1227, 2492, 6, 8.8,"/home/nina/Java/Battle-of-Cards-kiss/src/cardgame/images/IMG_0016.JPG");

	public int id;
	public int tSpeed;
	public int weight;
	public int displacement;
	public int cylinder;
	public double acceleration;
	public String imageLink;

	private Car(int id, int tSpeed, int weight, int displacement, int cylinder, double acceleration, String imageLink)
	{
		this.id = id;
		this.tSpeed = tSpeed;
		this.weight = weight;
		this.displacement = displacement;
		this.cylinder = cylinder;
		this.acceleration = acceleration;
		this.imageLink = imageLink;
	}
	

	public int getId() {
		return id;
	}

	public String toString() {
		return "" + this.name() + ": TopSpeed: " + tSpeed + ", Weight: " + weight + ", Displacement: " + displacement + ", Cylinder: " + cylinder + ", Acceleration: " + acceleration;
	}
	
}
