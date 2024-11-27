import java.util.ArrayList;

import javax.swing.JOptionPane; 
public class Run {

    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        String menu = """
        1. añadir mascota
        2. Mostrar mascotas
        3. Datos de mascota
        4. Eliminar mascota
        5. Actualizar mascota
        6. Salir""";
        int opcion = 0;

        while (opcion!=6) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:
                    String id=JOptionPane.showInputDialog("Ingrese el id de la mascota");
                    String raza = JOptionPane.showInputDialog("Ingrese la raza de la mascota");
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la mascota");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la mascota"));
                    String cedula = JOptionPane.showInputDialog("Ingrese la cedula del dueño");
                    String nombreOwner = JOptionPane.showInputDialog("Ingrese el nombre del dueño");
                    String numeroTelefono = JOptionPane.showInputDialog("Ingrese el numero de telefono del dueño");
                    pets.add(new Pet(id, raza, nombre, edad, new Persona(cedula, nombreOwner, numeroTelefono)));
                    break;
                case 2:
                    String mascotas="";
                    for (int i = 0; i < pets.size(); i++) {
                        mascotas = mascotas +"Nombre mascota: "+ pets.get(i).getNombre()+
                        "Nombre del dueño: "+pets.get(i).getOwner().getNombre()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, mascotas);
                    break;
                case 3:
                    String idBuscar = JOptionPane.showInputDialog("Ingrese el id a buscar");
                    for (int i = 0; i < pets.size(); i++) {
                        if (pets.get(i).getId().equals(idBuscar)) {
                            String datosMascota = "Nombre: "+pets.get(i).getNombre()+
                            "\nRaza: "+pets.get(i).getRaza()+
                            "\nEdad: "+pets.get(i).getEdad()+
                            "\nNombre dueño: "+pets.get(i).getOwner().getNombre();
                            JOptionPane.showMessageDialog(null, datosMascota);
                            break;
                        }
                    }
                    break;
                case 4:
                String idEliminar = JOptionPane.showInputDialog("Ingrese el id a eliminar");
                for (int i = 0; i < pets.size(); i++) {
                    if (pets.get(i).getId().equals(idEliminar)) {
                        String datosMascota = "Nombre: "+pets.get(i).getNombre()+
                        "\nRaza: "+pets.get(i).getRaza()+
                        "\nEdad: "+pets.get(i).getEdad()+
                        "\nNombre dueño: "+pets.get(i).getOwner().getNombre();
                        JOptionPane.showMessageDialog(null, datosMascota);
                        pets.remove(i);
                        break;
                    }
                }
                break;
            case 5:
            String idActualizar = JOptionPane.showInputDialog("Ingrese el id a actualizar");
            for (int i = 0; i < pets.size(); i++) {
                if (pets.get(i).getId().equals(idActualizar)) {
                    String nombreActualizar = JOptionPane.showInputDialog("Ingrese el nombre a actualizar");
                    String numeroTelefonoActualiozar = JOptionPane.showInputDialog("Ingres el numero de telefono a actualizar");
                    pets.get(i).setNombre(nombreActualizar);
                    pets.get(i).getOwner().setNumeroTelefono(numeroTelefonoActualiozar);

                    break;
                }
            }
            break;
                default:
                    break;
            }
        }
    }
    
}
