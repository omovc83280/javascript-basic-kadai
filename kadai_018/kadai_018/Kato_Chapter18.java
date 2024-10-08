package kadai_018;

public abstract class Kato_Chapter18 {
public String familyName;
public String givenName;
public String addres;



public void commonIntroduce() {
	familyName = "加藤";
	addres = "東京都中野区〇×";
	System.out.println("名前は"+familyName+givenName+"です");
	System.out.println("住所は"+addres+"です");
};

public abstract void eachIntroduce(); 


public void execIntroduce() {
	commonIntroduce();
	eachIntroduce();
};
	
}


