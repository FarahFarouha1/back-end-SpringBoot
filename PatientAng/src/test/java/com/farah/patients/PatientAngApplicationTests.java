package com.farah.patients;
import java.util.Date;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.farah.patients.entities.Patient;
import com.farah.patients.entities.Service;
import com.farah.patients.repos.PatientRepository;  


@SpringBootTest
class PatientsApplicationTests {
	
@Autowired
private PatientRepository patientRepository;

@Test
public void testCreatePatient() {
	
Patient pas = new Patient("jhbdhcb,","hbhudsb",new Date());
patientRepository.save(pas);

}



@Test
public void testFindPatient()
{
	Patient  p = patientRepository.findById(1L).get(); 
System.out.println(p);
}

@Test
public void testUpdatePatient()
{
	Patient  p = patientRepository.findById(1L).get();
p.setPrenomPatient("fki");
patientRepository.save(p);
}
@Test
public void testDeletePatient ()
{
	patientRepository.deleteById(1L);;
}
 
@Test
public void testListerTousPatients()
{
List<Patient > pas = patientRepository.findAll();
for (Patient p : pas)
{
System.out.println(p);
}
}

@Test
public void testFindByNomPatient()
{
List<Patient> pas = patientRepository.findByNomPatient("jhbdh");
for (Patient p : pas)
{
System.out.println(p);
}

}
@Test
public void testFindByNomPatientContains ()
{
List<Patient> pas=patientRepository.findByNomPatientContains("iphondfe");
for (Patient p : pas)
{
System.out.println(p);
} }
@Test
public void testfindByNomPrenom()
{
List<Patient> pas = patientRepository.findByNomPrenom("iphone X", "1000.0");
for (Patient p : pas)
{
System.out.println(p);
}
}
//@Test
//public void testfindByService()
//{
//Service ser= new Service();
//ser.setIdSer(1L);
//List<Patient> pas = patientRepository.findByService(ser);
//for (Patient p : pas)
//{
//System.out.println(p);
//}
//}

@Test
public void findByServiceIdSer()
{
List<Patient> pas = patientRepository.findByServiceIdSer(1L);
for (Patient p : pas)
{
System.out.println(p);
}
 }

@Test
public void trierPatientsNomsPrenom()
{
List<Patient> pas = patientRepository.trierPatientsNomsPrenom();
for (Patient p : pas)
{
System.out.println(p);
}
 }
}
