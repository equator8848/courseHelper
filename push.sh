git add .

git commit -m "$1"

git push origin master

ssh -i X:/configuration/server_key/key/root  root@132.232.2.232 "cd /data/courseHelper/ ; sh release.sh"