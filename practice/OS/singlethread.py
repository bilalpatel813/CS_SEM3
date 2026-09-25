import threading 

class ThreadDemo(threading.Thread):
  def __init__(self,thread_name,thread_id):
    super().__init__()
    self.thread_name=thread_name
    self.thread_id=thread_id

  def run(self):
    print(str(self.thread_name)+" "+str(self.thread_id))

threading1= ThreadDemo("Bilal",19)
threading2= ThreadDemo("Threading",2026)

threading1.start()
threading1.join()
threading2.start()
threading2.join()
print("exit")