import time


li=[]
class Porcess(object):
	def __init__(self,name,burst_time,priority):
		self.process_name=name
		#self.arrival_time=arrival_time
		self.burst_time=burst_time
		self.priority=priority


def fcfs():
	global pointer
	global li
	if len(li)>0:
		bt=li[pointer].burst_time
		pointer+=1
		sleep(bt)

def round_robin():
	global li
	tli=[]
	for i in range(0,len(li)):
		tli.append(li[i])
	flag=True
	ft=3
	while flag:
		flag=False
		for i in range(0,len(tli)):
			if len(tli)>0:
				tli[i].burst_time=tli[i].burst_time-ft
				sleep(ft)
				if tli[i].burst_time>0:
					flag=True	

	
def take_input():
	global li
	print "enter the relevant data"
	name=raw_input("enter the process name")
	burst_time=raw_input("enter the process burst time")
	priority=raw_input("enter the process priority")
	
	process=Process(name,burst_time,priority)
	li.append(process)
	
def mainFunction():
	ch=0
	while ch<=4:
	
		print "enter 1 to insert"
		print "enter 2 to schedule by fcfs"
		print "enter 3 to schedule by round robin"
		print "entre 4 to exit "
		ch=int(raw_input())
		if ch==1:
			take_input()
		elif ch==2:
			fcfs()
		elif ch==3:
			round_robin()
		

if __name__=='__main__':
	mainFunction()			