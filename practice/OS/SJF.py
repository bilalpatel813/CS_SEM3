def findwaitTime(processes,n,wt,bt):
  wt[0]=0
  for i in range(1,n):
    wt[i]=bt[i-1]+wt[i-1]


def findturnaroundTime(processes,n,wt,bt,tat):
  for i in range(n):
    tat[i]=wt[i]+bt[i]


def findavgTime(processes,n,bt):
  wt=[0]*n
  tat=[0]*n

  total_wt=0
  total_tat=0

  findwaitTime(processes,n,wt,bt)
  findturnaroundTime(processes,n,wt,bt,tat)
  print("processes\t Burst time\t Waiting time\t turn around time")
  for i in range(n):
    total_wt=total_wt+wt[i]
    total_tat=total_tat+tat[i]
    print(processes[i],"\t\t ",bt[i],"\t\t ",wt[i],"\t\t ",tat[i])
  print("Average waiting time: ",total_wt/n)
  print("Average turn around time: ",total_tat/n)

if __name__=='__main__':
  processes = [1, 2, 3, 4]
  n = 4
  # Burst times
  burst_time = [6, 8, 7, 3]
  for i in range(n):
    for j in range(i):
      if burst_time[i]>burst_time[j]:
        burst_time[i],burst_time[j]=burst_time[j],burst_time[i]
        processes[i],processes[j]=processes[j],processes[i]
  print("Non-pre emptive SJF algorithm")
  findavgTime(processes,n,burst_time)
  
        
    
    