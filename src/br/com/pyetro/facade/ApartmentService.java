package br.com.pyetro.facade;

public class ApartmentService implements IApartmentService{
    @Override
    public boolean registerApartment(Apartment apartment) {
        Boolean isRegistered = isApartmentRegistered(apartment);
        Boolean isValidFields = isValidFields(apartment);
        if (isRegistered && !isValidFields){
            return false;
        }
        return registerInDataBase(apartment);
    }

    private boolean registerInDataBase(Apartment apartment) {
        //register's logic.
        return true;
    }

    private Boolean isValidFields(Apartment apartment) {
        //verify if it is registered in database
        return true;
    }

    private Boolean isApartmentRegistered(Apartment apartment) {
        //verify if it is registered in database
        return false;
    }
}
