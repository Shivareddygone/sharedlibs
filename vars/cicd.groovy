def newgit(repo)
{
 git "https://github.com/intelliqittrainings/${repo}"
}

def newMaven()
{
  sh 'Mvn package'
}
