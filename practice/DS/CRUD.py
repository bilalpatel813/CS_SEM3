class Student:
  next_id= 1
  def __init__(self,name,elective):
    self.student_id = Student.next_id
    self.name = name
    self.elective = elective
    Student.next_id+=1
  student_db =[]

  def add_student(self):
    Student.student_db.append(self)
    print(f"{self.student_id}|{self.name}|{self.elective} is added to database")

  def update_student(self,new_elective):
    for student in Student.student_db:
      if student.student_id == self.student_id:
        student.elective  = new_elective
        return "Student updated successfully"
      return "Stduent Not found"
  
  def remove_student(self):
    for i in range(len(Student.student_db)):

      if Student.student_db[i].student_id == self.student_id:
        print("\n\nRemoving student ",self.name)
        Student.student_db.pop(i)
        return "Student removed successfully"
  @classmethod
  def display_database(cls):
    print("\n\n  Current student record  ")
    for student in Student.student_db:
      print(f"ID:{student.student_id} | Name:{student.name} | elective:{student.elective}")
    

Nahid = Student("Nahid", "IOT")
Nahid.add_student()
yusuf = Student("Yusuf", "ML")
yusuf.add_student()
ismail = Student("Ismail", "IOT")
ismail.add_student()
fareed = Student("Fareed", "AI")
fareed.add_student()

Student.display_database()
        
      
    
    