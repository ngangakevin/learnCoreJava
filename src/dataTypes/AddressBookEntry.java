package dataTypes;

import org.jetbrains.annotations.NotNull;

public class AddressBookEntry implements Comparable<AddressBookEntry>{
    private int id;
    private String name, address, phone;

    public AddressBookEntry(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public int compareTo(@NotNull AddressBookEntry other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof AddressBookEntry && this.name.equalsIgnoreCase(((AddressBookEntry) o).name);
    }

    @Override
    public int hashCode(){
        return name.toLowerCase().hashCode();
    }
}
