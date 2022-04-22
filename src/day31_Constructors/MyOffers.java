package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1=new Offer();
        offer1.setInfo("VA","Amazon","SDET",11000,true,true,true,true);
        System.out.println(offer1); //Offer{location='null', companyName='null', jobTitle='null', salary=0.0, hasBenefit=false, hasPTO=false, isWFH=false, isFullTime=false}

        Offer offer2=new Offer();
        offer2.setInfo("Ca","Sony","QA",120000,true,false,false,true);
        System.out.println(offer2);

        Offer offer3=new Offer();
        offer3.setInfo("FL","Apple","QE",125000,true,true,true,false);
        System.out.println(offer3);
        Offer offer4=new Offer();
        offer4.setInfo("TX","Capital","SM",115000,false,false,true,true);
        System.out.println(offer4);
        Offer offer5=new Offer();
        offer5.setInfo("WA","Bank","Ba",130000,true,true,false,false);
        System.out.println(offer5);


        Offer [] myOffers={offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> fullTimeOffers= new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p -> !p.isFullTime); // removes if the offer is not fulltime
        System.out.println(fullTimeOffers.size());



















    }


}
