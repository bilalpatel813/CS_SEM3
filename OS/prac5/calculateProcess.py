def findWaitingTime(processes, n, bt, wt):
    # Waiting time for first process is 0
    wt[0] = 0

    # Calculate waiting time for remaining processes
    for i in range(1, n):
        wt[i] = wt[i - 1] + bt[i - 1]


def findTurnAroundTime(processes, n, bt, wt, tat):
    # Turnaround time = Burst Time + Waiting Time
    for i in range(n):
        tat[i] = bt[i] + wt[i]


def findAverageTime(processes, n, bt):
    wt = [0] * n
    tat = [0] * n

    findWaitingTime(processes, n, bt, wt)
    findTurnAroundTime(processes, n, bt, wt, tat)

    print("Process\tBurst Time\tWaiting Time\tTurnaround Time")

    total_wt = 0
    total_tat = 0

    for i in range(n):
        total_wt += wt[i]
        total_tat += tat[i]

        print(
            processes[i],
            "\t",
            bt[i],
            "\t\t",
            wt[i],
            "\t\t",
            tat[i]
        )

    print("\nAverage waiting time = %.2f" % (total_wt / n))
    print("Average turnaround time = %.2f" % (total_tat / n))


if __name__ == "__main__":
    processes = [1, 2, 3, 4]
    n = 4

    # Burst times
    burst_time = [6, 8, 7, 3]

    # Sort processes according to burst time
    for i in range(n):
        for j in range(i + 1, n):
            if burst_time[i] > burst_time[j]:
                burst_time[i], burst_time[j] = burst_time[j], burst_time[i]
                processes[i], processes[j] = processes[j], processes[i]

    print("Non-Premptive SJF Scheduling\n")

    findAverageTime(processes, n, burst_time)