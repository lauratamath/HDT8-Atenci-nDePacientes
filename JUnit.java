/**
*@author: Laura Tamath
*@since 26/03/2020
*@version /03/2020
*referencias: Documentos subidos por Douglas a canvas
**/
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JUnit{

	@Test
	public void testParent(){
        int i = 0;
        int expResult = 0;
        Paciente pac2 = new Paciente("Andrea Amaya", "apendicitis", "A");
        Paciente pac1 = new Paciente("Oliver de Leon", "fractura de pierna", "C");
        Paciente pac3 = new Paciente("Brandon Hernandez","pendijitis", "B");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac3);
        paciente.add(pac1);
        int result = paciente.parent(i);
        assertEquals(expResult, result);
	}

	@Test
    public void testLeft() {
        int i = 0;
        int expResult = 1;
        Paciente pac2 = new Paciente("Andrea Amaya", "apendicitis", "A");
        Paciente pac1 = new Paciente("Oliver de Leon", "fractura de pierna", "C");
        Paciente pac3 = new Paciente("Brandon Hernandez","pendijitis", "B");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac3);
        paciente.add(pac1);
        int result = paciente.left(i);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRight() {
        int i = 0;
        int expResult = 2;
        Paciente pac2 = new Paciente("Andrea Amaya", "apendicitis", "A");
        Paciente pac1 = new Paciente("Oliver de Leon", "fractura de pierna", "C");
        Paciente pac3 = new Paciente("Brandon Hernandez","pendijitis", "B");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac3);
        paciente.add(pac1);
        int result = paciente.right(i);
        assertEquals(expResult, result);        
    }

	@Test
    public void testPercolateUp() {
        int leaf = 0;
        VectorHeap instance = new VectorHeap();
        Paciente pac2 = new Paciente("Andrea Amaya", "apendicitis", "A");
        Paciente pac1 = new Paciente("Oliver de Leon", "fractura de pierna", "C");
        Paciente pac3 = new Paciente("Brandon Hernandez","pendijitis", "B");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac3);
        paciente.add(pac1);
        paciente.percolateUp(leaf);
    }    

    @Test
    public void testAdd() {
        VectorHeap instance = new VectorHeap();
        
      	Paciente pac2 = new Paciente("Andrea Amaya", "apendicitis", "A");
        Paciente pac1 = new Paciente("Oliver de Leon", "fractura de pierna", "C");
        Paciente pac3 = new Paciente("Brandon Hernandez","pendijitis", "B");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac3);
        paciente.add(pac1);
        
        
        String expectedNombre = paciente.remove().getNombre();
        String value = "Andrea Amaya";
        
        assertEquals(expectedNombre, value);
    }

    @Test
    public void testPushDownRoot() {
        int root = 0;
        VectorHeap instance = new VectorHeap();
        Paciente pac2 = new Paciente("Andrea Amaya", "apendicitis", "A");
        Paciente pac1 = new Paciente("Oliver de Leon", "fractura de pierna", "C");
        Paciente pac3 = new Paciente("Brandon Hernandez","pendijitis", "B");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac3);
        paciente.add(pac1);
        paciente.pushDownRoot(root);
    }

    @Test
    public void testRemove() {
        VectorHeap instance = new VectorHeap();
        String expResult = "Andrea Amaya -- apendicitis -- A";
        Paciente pac2 = new Paciente("Andrea Amaya", "apendicitis", "A");
        Paciente pac1 = new Paciente("Oliver de Leon", "fractura de pierna", "C");
        Paciente pac3 = new Paciente("Brandon Hernandez","pendijitis", "B");
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac3);
        paciente.add(pac1);
        Object result = paciente.remove();
        assertEquals(expResult, result.toString());
    }

    @Test
    public void testGetFirst() {
        VectorHeap instance = new VectorHeap();
         String expResult = "Andrea Amaya -- apendicitis -- A";
        Paciente pac2 = new Paciente("Andrea Amaya", "apendicitis", "A");
        Paciente pac1 = new Paciente("Oliver de Leon", "fractura de pierna", "C");
        Paciente pac3 = new Paciente("Brandon Hernandez","pendijitis", "B");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac3);
        paciente.add(pac1);
        Paciente result = paciente.getFirst();
        
        assertEquals(expResult, result.toString());
    }

	 @Test
    public void testSize() {
        VectorHeap instance = new VectorHeap();
        int expResult = 2;
        Paciente pac2 = new Paciente("Andrea Amaya", "apendicitis", "A");
        Paciente pac1 = new Paciente("Oliver de Leon", "fractura de pierna", "C");
        Paciente pac3 = new Paciente("Brandon Hernandez","pendijitis", "B");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
       	paciente.add(pac2);
        paciente.add(pac3);
        paciente.add(pac1);
        int result = paciente.size();
        assertEquals(expResult, result);
    }   

    @Test
    public void testClear() {
        VectorHeap instance = new VectorHeap();
        Paciente pac2 = new Paciente("Andrea Amaya", "apendicitis", "A");
        Paciente pac1 = new Paciente("Oliver de Leon", "fractura de pierna", "C");
        Paciente pac3 = new Paciente("Brandon Hernandez","pendijitis", "B");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac3);
        paciente.add(pac1);
        paciente.clear();
        // TODO review the generated test code and remove the default call to fail.
        
    } 

}