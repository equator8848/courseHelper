git add .

if [ "$1" ]; then
    msg=$1
else
    msg="update static resources at `date`"
fi

git commit -m "$msg"

git push origin master

ssh -i X:/configuration/server_key/key/root  root@132.232.2.232 "cd /data/courseHelper; git pull; /bin/cp -rf /data/courseHelper/src/main/resources/static/** /data/wwwroot/default/courseHelper"