#!/bin/bash
for run in {1..100}
do
date +%H:%M:%S 
 echo $run
 ps -ef | head -2
 awk {'print$1'} /etc/os-release | head  -1
 #sleep 5 
 sleep 1
done 



touch ./{1..100}.txt
