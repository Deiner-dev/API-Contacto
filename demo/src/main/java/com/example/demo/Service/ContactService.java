package com.example.demo.Service;

import com.example.demo.Modelo.ContactoModelo;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {

    public List<ContactoModelo> obtenerContactos() {
        List<ContactoModelo> list = new ArrayList<>();
        list.add(new ContactoModelo(1, "Andres", 3234567678L));
        list.add(new ContactoModelo(2, "Lucia", 3212345679L));
        list.add(new ContactoModelo(3, "Carlos", 3235644563L));
        list.add(new ContactoModelo(4, "Abby", 3168234563L));
        list.add(new ContactoModelo(5, "Juan", 3237037671L));
        list.add(new ContactoModelo(6, "Maria", 3293067672L));
        list.add(new ContactoModelo(7, "Jose", 3716567670L));
        list.add(new ContactoModelo(8, "Yildris", 3006567671L));
        list.add(new ContactoModelo(9, "Mauricio", 3054567670L));
        list.add(new ContactoModelo(10, "Karol",     3134565670L));
        list.add(new ContactoModelo(11, "Matias",    3233480670L));
        list.add(new ContactoModelo(12, "Laura",     3204561230L));
        list.add(new ContactoModelo(13, "Pedro",     3107894560L));
        list.add(new ContactoModelo(14, "Sofia",     3156782340L));
        list.add(new ContactoModelo(15, "Diego",     3223456780L));
        list.add(new ContactoModelo(16, "Valeria",   3015678900L));
        list.add(new ContactoModelo(17, "Camilo",    3182345670L));
        list.add(new ContactoModelo(18, "Daniela",   3198765430L));
        list.add(new ContactoModelo(19, "Anderson",  3123456780L));
        list.add(new ContactoModelo(20, "Paula",     3001237890L));
        list.add(new ContactoModelo(21, "Jorge",     3114567890L));
        list.add(new ContactoModelo(22, "Natalia",   3209876540L));
        list.add(new ContactoModelo(23, "Luis",      3176543210L));
        list.add(new ContactoModelo(24, "Fernanda",  3137894560L));
        list.add(new ContactoModelo(25, "Ricardo",   3145678900L));
        list.add(new ContactoModelo(26, "Diana",     3214569870L));
        list.add(new ContactoModelo(27, "Hector",    3187654320L));
        list.add(new ContactoModelo(28, "Juliana",   3006543210L));
        list.add(new ContactoModelo(29, "Kevin",     3229876540L));
        list.add(new ContactoModelo(30, "Tatiana",   3151234560L));
        list.add(new ContactoModelo(31, "Brayan",    3167890120L));
        list.add(new ContactoModelo(32, "Alejandra", 3012345670L));
        list.add(new ContactoModelo(33, "Oscar",     3126789450L));
        list.add(new ContactoModelo(34, "Monica",    3149873210L));
        list.add(new ContactoModelo(35, "Esteban",   3192348760L));
        list.add(new ContactoModelo(36, "Claudia",   3184567890L));
        list.add(new ContactoModelo(37, "Sebastian", 3203456780L));
        list.add(new ContactoModelo(38, "Angela",    3008765430L));
        list.add(new ContactoModelo(39, "Cristian",  3178901230L));
        list.add(new ContactoModelo(40, "Patricia",  3112345670L));
        list.add(new ContactoModelo(41, "Felipe",    3224567890L));
        list.add(new ContactoModelo(42, "Lorena",    3156789010L));
        list.add(new ContactoModelo(43, "Gustavo",   3165432100L));
        list.add(new ContactoModelo(44, "Vanessa",   3189012340L));
        list.add(new ContactoModelo(45, "Alberto",   3003456780L));
        list.add(new ContactoModelo(46, "Carmen",    3129876540L));
        list.add(new ContactoModelo(47, "Raul",      3141237890L));
        list.add(new ContactoModelo(48, "Adriana",   3194561230L));
        list.add(new ContactoModelo(49, "Samuel",    3207894560L));
        list.add(new ContactoModelo(50, "Isabella",  3171234560L));
        list.add(new ContactoModelo(51, "Deiner", 3046479295L ));
        return list;
    }

    //Buscar por ID
    public ContactoModelo buscarPorId(int id) {
        for (ContactoModelo c : obtenerContactos()) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    //Buscar por nombre
    public List<ContactoModelo> buscarPorNombre(String nombre) {
        List<ContactoModelo> resultado = new ArrayList<>();

        for (ContactoModelo c : obtenerContactos()) {
            if (c.getName().equalsIgnoreCase(nombre)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    // Buscar por teléfono
    public ContactoModelo buscarPorTelefono(long telefono) {
        for (ContactoModelo c : obtenerContactos()) {
            if (c.getPhone() == telefono) {
                return c;
            }
        }
        return null;
    }
}
