package com.superigno.accessmodifiers.foo;

import com.superigno.accessmodifiers.BigCat;

public class Lynx extends BigCat {
	
	public static void main(String[] args) {
		BigCat cat = new BigCat();
		System.out.println(cat.namePublic);
	//	System.out.println(cat.hasFurProtected); //error!!! :O
	//	System.out.println(cat.hasPawsDefault); //error
	//	System.out.println(cat.idPrivate); //error		
		
		Lynx lynx = new Lynx();
		System.out.println(lynx.namePublic);
		System.out.println(lynx.hasFurProtected);
	//	System.out.println(lynx.hasPawsDefault); //error
	//	System.out.println(lynx.idPrivate); //error
	}

}
