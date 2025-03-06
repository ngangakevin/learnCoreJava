package dataTypes;

import java.util.TreeSet;

public class LearnTreeSet {
public static void main(String[] args){
    AddressBookEntry addr1 = new AddressBookEntry("Peter");
    AddressBookEntry addr2 = new AddressBookEntry("John");
    AddressBookEntry addr3 = new AddressBookEntry("Patrick");
    AddressBookEntry addr4 = new AddressBookEntry("peter");

    TreeSet<AddressBookEntry> set = new TreeSet<>();
    set.add(addr1);
    set.add(addr2);
    set.add(addr3);
    set.add(addr4);
    System.out.println(set);

    System.out.println(set.floor(addr2));
    System.out.println(set.lower(addr2));
    System.out.println(set.headSet(addr2));
    System.out.println(set.tailSet(addr2));
}
}
