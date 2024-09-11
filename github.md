# 수업을 위한 Git 사용 설정

## 키 설정 및 Git 사용을 위한 정보 등록 (로컬 컴퓨터에서 한번 설정)

```bash
ssh-keygen
cat ~/.ssh/id_ed25519.pub
```
- 깃헙 설정에 반영한다 (Settings -> SSH and GPG Keys -> New SSH Key)


-  로컬 깃 환경에 이메일과 이름을 등록한다

```bash
git config --global user.email "gildong@email.com"
git config --global user.name "Gildong Hong"
```

## 수업을 위한 공간 설정

- bash shell을 수행한다 (git bash)
  - 컴퓨터에 git이 설치되어 있지 않은 경우 git 설치를 먼저 진행한다 (https://git-scm.com에서 환경에 맞는 버전을 다운로드해서 설치한다)

- 수업을 진행할 워크스페이스 폴더로 이동

```bash
cd algorithms-2024/
```

- 초기 파일 생성 및 remote repository와 연결 및 초기 파일 등록 진행

```
echo "# 홍길동을 위한 알고리즘 학습 공간" > README.md
git init
git  add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:algorithm-2024/algorithms-______.git
git push origin main
```

## Gitignore 설정하기

- 이클립스, java 개발 결과 중 github에 등록하지 말아야 할 정보를 .gitignore 파일에 추가한다.
  (https://www.toptal.com/developers/gitignore) 사이트를 활용하여 파일 정보를 생성

- 생성한 .gitignore 파일을 커밋/푸시 진행

```
git add .gitignore
git commit -m "gitignore 파일 생성"
git push origin main
```

## Git 사용 절차 (Simple)

- git pull
- 작업을 진행한다
- git status
- git add
- git commit
- git push
