package week3.day1;

public class sports {
	public static void acheiver(String name, int medalCount) {
		System.out.println("name"+':'+name);
		System.out.println("medalCount"+ medalCount);
	}
	public void acheiver(String country ,String sportName, int rank) {
		System.out.println("Country name: "+country);
		System.out.println("Game name is:"+sportName);
		System.out.println("Rank:"+rank);
	}
	public void acheiver(float weight, int height, long contactNo) {
		System.out.println("Weight:"+weight);
		System.out.println("Height:"+height);
		System.out.println("ContactNo:"+contactNo);
	}
	public void acheiver(String tournamentName, long prizeMoney) {
		System.out.println("Tournament Name:"+tournamentName);
		System.out.println("Prize Money:"+prizeMoney);
	}
	public static void main(String[] args) {
		sports get=new sports();
		get.acheiver("balaji S", 89);
		get.acheiver("India", "Track Events", 2);
		get.acheiver(58, 176, 646467698);
		get.acheiver("National 2022 Trackevents", 150000);

}
}
