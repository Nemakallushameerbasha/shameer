package question_5;


	import java.util.HashMap;
	import java.util.Map;

	public class BankDB {
		static Map<Integer,BankCustomer> bankDB;
		static {
			bankDB=new HashMap<Integer, BankCustomer>();
			bankDB.put(11111, new BankCustomer(11111,"shameer","ap",15000.0));
			bankDB.put(11122, new BankCustomer(11122,"uday","ks",10000.0));
			bankDB.put(11133, new BankCustomer(11133,"Ganesh","Bngl",18500.0));
			bankDB.put(11144, new BankCustomer(11144,"Krishna","mh",25000.0));
			bankDB.put(11155, new BankCustomer(11155,"Arun","Kurnool",18500.0));
			bankDB.put(11166, new BankCustomer(11166,"Darshan","Hospet",30500.0));
			bankDB.put(11177, new BankCustomer(11177,"Vinay","Chennai",12500.0));
			bankDB.put(11188, new BankCustomer(11188,"Harish","Hubli",18500.0));
			bankDB.put(11199, new BankCustomer(11199,"Vinayak","Athani",21000.0));
			bankDB.put(22222, new BankCustomer(22222,"varun","kadapa",22000.0));
		}
	}


