def findwaitTime(processes,n,bt,wt):
  wt[0]=0
  for i in range(1,n):
    wt[i]=bt[i-1]+wt[i-1]

def findturnaroundTime(processes,n,bt,wt,tat):
  for i in range(n):
    tat[i]=wt[i]+bt[i]

def findavgTime(processes,n,bt):
  wt = [0]*n
  tat=[0]*n

  total_wt=0
  total_tat=0
  findwaitTime(processes,n,bt,wt)
  findturnaroundTime(processes,n,bt,wt,tat)
  print("processes\t Burst time\t Waiting time\t turn around time")
  for i in range(n):
    total_wt = total_wt+wt[i]
    total_tat=  total_tat+tat[i]
    print("\t",processes[i],"\t\t\t",bt[i],"\t\t\t",wt[i],"\t\t\t",tat[i])
  print("Average waiting time",total_wt/n)
  print("Average turn around time",total_tat/n)


if __name__=='__main__':
  processes = [1,2,3,4,5]
  n = len(processes)
  burst_time = [10, 5, 8, 2, 5]
  findavgTime(processes,n,burst_time)
  
  
  