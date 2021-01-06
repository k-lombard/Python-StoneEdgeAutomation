import os
import os.path
import subprocess
import time
import signal
from subprocess import STDOUT,PIPE, Popen
from threading import Thread
import multiprocessing
from multiprocessing.pool import Pool
from multiprocessing import freeze_support


def compile_java(java_file):
    subprocess.run(['your jdk location', '-classpath .;your sikulix location', java_file])

def execute_java(java_file):
    java_class,ext = os.path.splitext(java_file)
    cmd = ['java', '-classpath', 'your sikulix location', java_class]
    proc = subprocess.Popen(cmd, cwd='your current working directory location')
    stdout,stderr = proc.communicate(input='SomeInputstring')
    print (stdout)
    Popen("TASKKILL /F /PID {pid} /T".format(pid=proc.pid))

def main():
    command  = r"your stone edge .mdb location"

    proc2 = subprocess.Popen(command, stdout=subprocess.PIPE, shell=True)
    print("starting")
    time.sleep(25)
    print("done sleeping")
    execute_java('App.java')  
    Popen("TASKKILL /F /PID {pid} /T".format(pid=proc2.pid)) 
    print("finished")

main()

