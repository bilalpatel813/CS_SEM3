import threading

def fibo():
  nterm=int(input("Enter num for fibo implementation: "))
  n1,n2=0,1
  count =0

  if nterm<=0:
    print("Enter positive & greater than zero number")
  elif nterm==1:
    print("fibo sequence upto",nterm,":")
  else:
    print("Fibo Sequence : ")
    while count<nterm:
      print(n1)
      nth = n1+n2
      n1=n2
      n2=nth
      count+=1

if __name__=='__main__':
  t1=threading.Thread(target=fibo)
  t1.start()
  t1.join()
  print("Done")

