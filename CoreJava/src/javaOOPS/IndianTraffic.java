package javaOOPS;

import demoPackage.CentralTraffic;
import demoPackage.PuneTraffic;

public class IndianTraffic implements CentralTraffic,PuneTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralTraffic traffic = new IndianTraffic();
		traffic.GreenGo();
		traffic.RedStop();
		traffic.flashYellow();
		
	
		PuneTraffic punetraffic = new IndianTraffic();
		punetraffic.trainsymbol();
		punetraffic.cyclesGo();
		
		IndianTraffic time = new IndianTraffic();
		time.walkonsymbolway();
		
	}
	
	public void walkonsymbolway ()
	{
		System.out.println("Please check walking symbol");
		
	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green Go Implemented");
		
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop Implemented");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow Flash Implemented");
	}

	@Override
	public void trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train traffic Implemented");
	}

	@Override
	public void cyclesGo() {
		// TODO Auto-generated method stub
		System.out.println("cycles Go Implemented");
		
	}

}
