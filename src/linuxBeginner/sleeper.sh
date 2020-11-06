#!/bin/bash
for run in {1..100}
do
date +%H:%M:%S 
 echo $run
 ps -ef | tail +2 | wc -l
  #sleep 5 
 sleep 1
done 

cat cpuinfo | grep "model name"| head -1 > ./cpu

#awk -F = {'print$2'} /etc/os-release | head  -1
 awk -F = '$1=="NAME" {print$2}' /etc/os-release >> ./cpu

touch ./{1..100}.txt
