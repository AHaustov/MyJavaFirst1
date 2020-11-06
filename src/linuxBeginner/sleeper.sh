#!/bin/bash
for run in {1..100}
do
date +%H:%M:%S 
 echo $run
 ps -ef | head -2
 #awk -F = {'print$2'} /etc/os-release | head  -1
 awk -F = '$1=="NAME" {print$2}' /etc/os-release 
 #sleep 5 
 sleep 1
done 



touch ./{1..100}.txt
