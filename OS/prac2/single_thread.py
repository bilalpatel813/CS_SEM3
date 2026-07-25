#Single threading

import threading

class ThreadDemo(threading.Thread):
    def __init__(self, thread_name, thread_ID):
        super().__init__()
        self.thread_name = thread_name
        self.thread_ID = thread_ID

    def run(self):
        print(str(self.thread_name) + " " + str(self.thread_ID))

thread1 = ThreadDemo("GFG", 1000)
thread2 = ThreadDemo("Geeks for Geeks", 2000)

thread1.start()
thread2.start()

thread1.join()
thread2.join()

print("Exit")

