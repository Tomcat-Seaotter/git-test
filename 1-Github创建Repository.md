# 01-GitHub创建Repository

GitHub是基于git实现的代码托管。git是目前最好用的版本控制系统了，非常受欢迎，比svn更好。GitHub可以免费使用，并且快速稳定。即使是付费帐户，每个月不超过10美刀的费用也非常便宜。利用GitHub，你可以将项目存档，与其他人分享交流，并让其他开发者帮助你一起完成这个项目。优点在于，他支持多人共同完成一个项目，因此你们可以在同一页面对话交流。创建自己的项目，并备份，代码不需要保存在本地或者服务器，GitHub做得非常理想。学习Git也有很多好处。他被视为一个预先维护过程，你可以按自己的需要恢复、提交出现问题,或者您需要恢复任何形式的代码，可以避免很多麻烦。Git最好的特性之一是能够跟踪错误，这让使用Github变得更加简单。Bugs可以公开，你可以通过Github评论，提交错误。在GitHub页面，你可以直接开始，而不需要设置主机或者DNS。

- [一、创建github repository(仓库)](https://link.zhihu.com/?target=https%3A//blog.csdn.net/ywsydwsbn/article/details/106427905%23github_repository_13)

- - [1-1 登录github](https://link.zhihu.com/?target=https%3A//blog.csdn.net/ywsydwsbn/article/details/106427905%2311_github_15)
  - [1-2 创建repository(仓库)](https://link.zhihu.com/?target=https%3A//blog.csdn.net/ywsydwsbn/article/details/106427905%2312_repository_22)

- [二、安装git客户端](https://link.zhihu.com/?target=https%3A//blog.csdn.net/ywsydwsbn/article/details/106427905%23git_46)

- - [2-1 下载git客户端](https://link.zhihu.com/?target=https%3A//blog.csdn.net/ywsydwsbn/article/details/106427905%2321_git_58)
  - [2-2 安装客户端](https://link.zhihu.com/?target=https%3A//blog.csdn.net/ywsydwsbn/article/details/106427905%2322__65)
  - [2-3 绑定用户](https://link.zhihu.com/?target=https%3A//blog.csdn.net/ywsydwsbn/article/details/106427905%2323__101)

- [三、为Github账户设置SSH key](https://link.zhihu.com/?target=https%3A//blog.csdn.net/ywsydwsbn/article/details/106427905%23GithubSSH_key_110)

- - [3-1 生成ssh key](https://link.zhihu.com/?target=https%3A//blog.csdn.net/ywsydwsbn/article/details/106427905%2331_ssh_key_119)
  - [3-2 为github账号配置ssh key](https://link.zhihu.com/?target=https%3A//blog.csdn.net/ywsydwsbn/article/details/106427905%2332_githubssh_key_134)

- [四、上传本地项目到github](https://link.zhihu.com/?target=https%3A//blog.csdn.net/ywsydwsbn/article/details/106427905%23github_145)

- - [4-1 创建一个本地项目](https://link.zhihu.com/?target=https%3A//blog.csdn.net/ywsydwsbn/article/details/106427905%2341__146)
  - [4-2 建立本地仓库](https://link.zhihu.com/?target=https%3A//blog.csdn.net/ywsydwsbn/article/details/106427905%2342__149)
  - [4-3 关联github仓库](https://link.zhihu.com/?target=https%3A//blog.csdn.net/ywsydwsbn/article/details/106427905%2343_github_179)
  - [4-4 上传本地代码](https://link.zhihu.com/?target=https%3A//blog.csdn.net/ywsydwsbn/article/details/106427905%2344__184)

## 一、创建GitHub Repository(仓库)

## 1-1 登录GitHub

github的官方网址：[https://github.com]，如果没有账号，赶紧注册一个。点击Sign in进入登录界面，输入账号和密码登入github。下面是本人自己的Github：[https://github.com/nb-snowpiercer]

![](fig1/fig12.png)



## 1-2 创建Repository(仓库)

为啥要叫repository(仓库)？我起初也纳闷，叫代码库不更简单明了么？ 但仔细一琢磨，仓库一般都是放粮食的吧，这是把代码当作饱腹之物，多有爱，瞬间觉得这冰冷冷的代码充满了查克拉。扯远了，来看怎么创建仓库，登录后可以看到有repository选项卡。


如果没在这个页面也没关系，点击右上角的头像旁边的小三角，展开后可以看到Your profile，点击进入后也能看到repository。切换到repository选项卡，可以看到很醒目的new按钮。不用犹豫，点击它，开始创建自己的粮仓了。下面是创建仓库信息，只有名字是必填项，现在我创建了一个仓库叫：Git_markdown（这里我已经创建过了，所以名字会报错，可自行命名）


创建成功，如下：

![](fig1/fig14.png)


可以看到自己的仓库地址，如此，我的远程免费的仓库就创建了。它还介绍了github仓库的常用指令。这个指令需要在本地安装git客户端。

```bash
git init 
//把这个目录变成Git可以管理的仓库
git add README.md 
//文件添加到仓库
git add . 
//不但可以跟单一文件，还可以跟通配符，更可以跟目录。一个点就把当前目录下所有未追踪的文件全部add了 
git commit -m "first commit" 
//把文件提交到仓库
git remote add origin git@github.com:Tomcat-Seaotter/git-Markdown.git
//关联远程仓库
git push -u origin master 
//把本地库的所有内容推送到远程库上
```

## 二、安装Git客户端

Git是目前世界上最先进的分布式版本控制系统，[git与svn的五个基本区别](https://link.zhihu.com/?target=https%3A//www.cnblogs.com/specter45/p/github.html%23gitandsvn)。它有以下特点：

- **分布式** : Git版本控制系统是一个分布式的系统, 是用来保存工程源代码历史状态的命令行工具;
- **保存点** : Git的保存点可以追踪源码中的文件, 并能得到某一个时间点上的整个工程项目额状态; 可以在该保存点将多人提交的源码合并, 也可以会退到某一个保存点上;
- **Git离线操作性** :Git可以离线进行代码提交, 因此它称得上是完全的分布式处理, Git所有的操作不需要在线进行; 这意味着Git的速度要比SVN等工具快得多, 因为SVN等工具需要在线时才能操作, 如果网络环境不好, 提交代码会变得非常缓慢;
- **Git基于快照** : SVN等老式版本控制工具是将提交点保存成补丁文件, Git提交是将提交点指向提交时的项目快照, 提交的东西包含一些元数据(作者, 日期, GPG等);
- **Git的分支和合并** : 分支模型是Git最显著的特点, 因为这改变了开发者的开发模式, SVN等版本控制工具将每个分支都要放在不同的目录中, Git可以在同一个目录中切换不同的分支；
- **分支即时性** : 创建和切换分支几乎是同时进行的, 用户可以上传一部分分支, 另外一部分分支可以隐藏在本地, 不必将所有的分支都上传到GitHub中去;
- **分支灵活性** : 用户可以随时 创建 合并 删除分支, 多人实现不同的功能, 可以创建多个分支进行开发, 之后进行分支合并, 这种方式使开发变得快速, 简单, 安全。

## 2-1 下载Git客户端

官方下载地址：[http://git-scm.com/download/](https://link.zhihu.com/?target=http%3A//git-scm.com/download/) 根据你自己的系统 下载对应版本。

![](fig1/fig15.png)

## 2-2 安装Git客户端

![](fig1/fig16.png)


下载好之后咋们开始安装吧，欢迎界面，下一步。


选择安装路径，千万别选带中文的路径，有时候会引起不必要的误会。

选择安装组件，按默认的来就好了。
1）图标组件(Addition icons) : 选择是否创建快速启动栏图标 或者 是否创建桌面快捷方式;
2）桌面浏览(Windows Explorer integration) : 浏览源码的方法, 单独的上下文浏览 只使用bash 或者 只用Git GUI工具; 高级的上下文浏览方法 使用git-cheetah plugin插件;
3）关联配置文件(Associate .git*) : 是否关联git配置文件, 该配置文件主要显示文本编辑器的样式;
4）关联shell脚本文件(Associate .sh) : 是否关联Bash命令行执行的脚本文件;
5）使用TrueType编码 : 在命令行中是否使用TruthType编码, 该编码是微软和苹果公司制定的通用编码;


设置开始菜单中快捷方式的目录名称，默认就好，下一步吧

设置环境变量 : 选择使用什么样的命令行工具, 一般情况下我们默认使用Git Bash即可, 默认选择;
1）Git自带 : 使用Git自带的Git Bash命令行工具;
2）系统自带CMD : 使用Windows系统的命令行工具;
3） 二者都有 : 上面二者同时配置, 但是注意, 这样会将windows中的find.exe 和 sort.exe工具覆盖, 如果不懂这些尽量不要选择;

选择换行格式 ，依然是默认就好。
1）检查出windows格式转换为unix格式 : 将windows格式的换行转为unix格式的换行在进行提交;
2）检查出原来格式转为unix格式 : 不管什么格式的, 一律转为unix格式的换行在进行提交;
3）不进行格式转换 : 不进行转换, 检查出什么, 就提交什么;


选择终端模拟器，依然默认就好

1）使用MinTTY，就是在Windows开了一个简单模拟Linux命令环境的窗口Git Bash

2）使用windows的系统的命令行程序cmd.exe


git终于安装成功咯。

## 2-3 绑定用户

打开`git-bash.exe`，在桌面快捷方式/开始菜单/安装目录中

因为Git是分布式版本控制系统，所以需要填写用户名和邮箱作为一个标识，用户和邮箱为你github注册的账号和邮箱

```bash
giga@DESKTOP-1IUCPF0 MINGW64 /e/github/java (main)
$ git config --global user.name "Tomcat-Seaotter"

giga@DESKTOP-1IUCPF0 MINGW64 /e/github/java (main)
$ git config --global user.email "2770064746@qq.com"
```

> ps：`git config –global 参数`，有了这个参数，表示你这台机器上所有的Git仓库都会使用这个配置，当然你也可以对某个仓库指定的不同的用户名和邮箱。

## 三、为Github账户设置SSH key

众所周知ssh key是加密传输。加密传输的算法有好多，git使用rsa，rsa要解决的一个核心问题是，如何使用一对特定的数字，使其中一个数字可以用来加密，而另外一个数字可以用来解密。这两个数字就是你在使用git和github的时候所遇到的public key也就是公钥以及private key私钥。其中，公钥就是那个用来加密的数字，这也就是为什么你在本机生成了公钥之后，要上传到github的原因。从github发回来的，用那公钥加密过的数据，可以用你本地的私钥来还原。如果你的key丢失了，不管是公钥还是私钥，丢失一个都不能用了，解决方法也很简单，重新再生成一次，然后在[http://github.com](https://link.zhihu.com/?target=http%3A//github.com)里再设置一次就行。

## 3-1 生成ssh key

首先检查是否已生成密钥 `cd ~/.ssh`，ls如果有2个文件，则密钥已经生成，id_rsa.pub就是公钥。也可以打开我的电脑C:\Users\Y\ .ssh 里面找到，如果没有生成，那么通过以下命令生成。

```bash
$ ssh-keygen -t rsa -C "2770064746@qq.com"
```

1）是路径确认，直接按回车存默认路径即可

2）直接回车键，这里我们不使用密码进行登录, 用密码太麻烦

3）直接回车键

```bash
$ ssh-keygen -t rsa -C "2770064746@qq.com"
Generating public/private rsa key pair.
Enter file in which to save the key (/c/Users/giga/.ssh/id_rsa):
/c/Users/giga/.ssh/id_rsa already exists.
Overwrite (y/n)? y
Enter passphrase (empty for no passphrase):
Enter same passphrase again:
Your identification has been saved in /c/Users/giga/.ssh/id_rsa
Your public key has been saved in /c/Users/giga/.ssh/id_rsa.pub
The key fingerprint is:
SHA256:mravUgkojpDhkitnTaYIwNQ0zsQ2RsWOKYhjV7+oxtE 2770064746@qq.com
The key's randomart image is:
+---[RSA 3072]----+
|o.==o.           |
|o.+*.o           |
|=+o+* .          |
|@+.++. .         |
|B=o=....S        |
|=.+..Eo+         |
|.o. o.+          |
|   +.. .         |
|  .  .oo.        |
+----[SHA256]-----+
```

生成成功后，去对应目录C:\Users\Y\ .ssh里（Y为电脑用户名，每个人不同）用记事本打开id_rsa.pub，得到ssh key公钥

```txt
ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDF6KpBOtOfw+BnM6f8DHCeUDjEqjSxYOkZgL/wcTl58QFSk8Ru53pig6ZaVmiDFpabIWgo++Oaa23Ql4o+HtwWkUkCcjk0G1zIWh5O4+VruiSj7aAJ05cCrZAmkcoUkG9iSi5LzBf+1B2fl8h53lr5A+VRbO9E0zYofFiVjVUcyXlDBf0ul0FzfGQS5dh3EBWWA9MDuJMfEQz8KGlexyyYTa80GvAqaJIIdCwE+OCHG5OZUcIw8FkfaYiohCHgXP4RYQaznklIq43LO9xo0TsH0V/GtwP0tKY4duiS8RSTpHTmtvsHbbjzGVCzuDh9VCX3UB8j4b1VY9ZvHssV8Ym3yGXIMthRUcTXzXkHAgEGPolh2LxAQgyopTB3GVjc8SyhFpra1hvk9D7EJj3EUAgtPtFdrMBmlH4IfBWX3AaFPaR8paHSuWuyDOrHgPCSwHkb55Xo5mkPSmstZI5DtmDIaXlZCDxmn3wtGfzE75j85y8VR11tvzJ5T9/Vy2Tf18k= 2770064746@qq.com
```

## 3-2 为github账号配置ssh key

切换到github，展开个人头像的小三角，点击settings。然后打开SSH keys菜单， 点击Add SSH key新增密钥，填上标题，跟仓库保持一致吧，好区分。接着将id_rsa.pub文件中key粘贴到此，最后Add key生成密钥吧。

![](fig1/fig17.png)

如此，github账号的SSH keys配置完成。

![image-20231004104943797](fig1/fig18.png)



## 四、上传本地项目到github

## 4-1 gitBash一个本地项目

```shell
giga@DESKTOP-1IUCPF0 MINGW64 /e/github
$ mkdir git
```

## 4-2 建立本地仓库

再来复习一下创建新仓库的指令：

```bash
git remote rm origin
//删除远程仓库

git init
//把这个目录变成Git可以管理的仓库

git add README.md //文件添加到仓库

git add . 
//不但可以跟单一文件，还可以跟通配符，更可以跟目录。一个点就把当前目录下所有未追踪的文件全部add了 

git commit -m "first commit"
//把文件提交到仓库

git remote add origin git@github.com:Tomcat-Seaotter/git-Markdown.git
//关联远程仓库

git pull --rebase origin master


git push -u origin master
//把本地库的所有内容推送到远程库上

git push -f origin master
//强制推送到远端服务器
```

首先，进入到wyj_first项目目录，还记得创建仓库成功后的那个页面吧，指令都在呢。

然后执行指令：`git init`


初始化成功后你会发现项目里多了一个隐藏文件夹.

这个目录是Git用来跟踪管理版本库的，没事千万不要手动修改这个目录里面的文件，不然改乱了，就把Git仓库给破坏了。


接着，将所有文件添加到仓库

执行指令：`git add .`


然后，把文件提交到仓库，双引号内是提交注释。

执行指令：`git commit -m "提交文件"`


如此本地仓库建立好了。

## 4-3 关联github仓库

到github wyj_first仓库复制仓库地址

![](fig1/fig19.png)


然后执行以下指令。

```shell
giga@DESKTOP-1IUCPF0 MINGW64 /e/github/git (master)
$ git remote add origin git@github.com:Tomcat-Seaotter/git-Markdown.git

giga@DESKTOP-1IUCPF0 MINGW64 /e/github/git (master)
$ git push -u origin master
Enumerating objects: 17, done.
Counting objects: 100% (17/17), done.
Delta compression using up to 16 threads
Compressing objects: 100% (14/14), done.
Writing objects: 100% (17/17), 762.54 KiB | 1.79 MiB/s, done.
Total 17 (delta 0), reused 0 (delta 0), pack-reused 0
remote:
remote: Create a pull request for 'master' on GitHub by visiting:
remote:      https://github.com/Tomcat-Seaotter/git-Markdown/pull/new/master
remote:
To github.com:Tomcat-Seaotter/git-Markdown.git
 * [new branch]      master -> master
branch 'master' set up to track 'origin/master'.
```

## 4-4 上传本地代码

执行指令：`git push -u origin master`

1）敲一个：yes， 然后回车

```shell
$ git push -u origin master

Enumerating objects: 17, done.
Counting objects: 100% (17/17), done.
Delta compression using up to 16 threads
Compressing objects: 100% (14/14), done.
Writing objects: 100% (17/17), 762.54 KiB | 1.79 MiB/s, done.
Total 17 (delta 0), reused 0 (delta 0), pack-reused 0
remote:
remote: Create a pull request for 'master' on GitHub by visiting:
remote:      https://github.com/Tomcat-Seaotter/git-Markdown/pull/new/master
remote:
To github.com:Tomcat-Seaotter/git-Markdown.git
 * [new branch]      master -> master
branch 'master' set up to track 'origin/master'.
```


到此，本地代码已经推送到github仓库了，我们现在去githubt仓库看看。

![image-20231004112320065](fig1/fig20.png)

```shell
git config --global init.defaultBranch <name>


git remote rm origin

git remote add origin git@github.com:nb-snowpiercer/Java-Markdown.git

git pull --rebase origin master

git push -u origin mastergit i
```

## 五、删除Repository

```shell
giga@DESKTOP-1IUCPF0 MINGW64 /e
$ cd github/space/StackEdit

giga@DESKTOP-1IUCPF0 MINGW64 /e/github/space/StackEdit (master)
$git init

giga@DESKTOP-1IUCPF0 MINGW64 /e/github/space/StackEdit (master)
$git clone https://github.com/nb-snowpiercer/StackEdit.git

giga@DESKTOP-1IUCPF0 MINGW64 /e/github/space/StackEdit (master)
$ git rm 在Ubuntu20.04安装The\ Littlest\ JupyterHub.md
rm '在Ubuntu20.04安装The Littlest JupyterHub.md'

giga@DESKTOP-1IUCPF0 MINGW64 /e/github/space/StackEdit (master)
$ git commit -m "third commit"
[master 16de47d] third commit
 1 file changed, 148 deletions(-)
 delete mode 100644 "\345\234\250Ubuntu20.04\345\256\211\350\243\205The Littlest
 JupyterHub.md"

giga@DESKTOP-1IUCPF0 MINGW64 /e/github/space/StackEdit (master)
$ git checkout
D       undefined
Your branch is ahead of 'origin/master' by 1 commit.
  (use "git push" to publish your local commits)

giga@DESKTOP-1IUCPF0 MINGW64 /e/github/space/StackEdit (master)
$ git push
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Delta compression using up to 16 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (2/2), 218 bytes | 218.00 KiB/s, done.
Total 2 (delta 1), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/nb-snowpiercer/StackEdit.git
   707bcfe..16de47d  master -> master
```

