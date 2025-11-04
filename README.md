# ☕ Java 연습 저장소

Java 프로그래밍 연습 및 예제를 담고 있는 저장소입니다.

## 📚 프로젝트 구조

이 저장소는 Java의 기초부터 고급 개념까지 다루는 40개 이상의 연습 프로젝트로 구성되어 있습니다.

### 🎯 학습 주제

#### 기초 개념 (exam01-exam10)
- **exam01**: Hello World & 기본 데이터 타입
- **exam02**: 연산자 (산술, 비교, 논리 연산자)
- **exam03**: 형 변환 (Type Casting)
- **exam04**: 조건문 (if-else)
- **exam05**: Switch 문
- **exam06-exam07**: For 반복문 & 중첩 반복문
- **exam08**: While & Do-While 반복문
- **exam09**: Break & Continue 문
- **exam10**: 배열 기초

#### 배열 & 자료구조 (exam11-exam14)
- **exam11**: 배열 복사 (얕은 복사 vs 깊은 복사)
- **exam12**: Arrays 클래스 유틸리티 (정렬, toString, copyOf)
- **exam13-exam14**: 다차원 배열 & 마방진

#### 객체지향 프로그래밍 (exam15-exam25)
- **exam15-exam18**: 클래스, 객체, 생성자 & 메서드
- **exam19**: 학생 관리 시스템
- **exam20**: 상속 (Book, Novel, ComicBook)
- **exam21**: 추상 클래스 & 추상 메서드
- **exam22**: 인터페이스 & 다중 상속
- **exam23**: 다형성 & 타입 캐스팅
- **exam24**: 중첩 클래스 (로컬, 멤버, 정적)
- **exam25**: 익명 클래스 & 이벤트 처리

#### 고급 개념 (exam26-exam40)
- **exam26**: 예외 처리 (try-catch, 사용자 정의 예외)
- **exam27**: JavaDoc 문서화
- **exam28**: Object 클래스 메서드 (equals, toString)
- **exam29**: String & StringBuilder
- **exam30**: Wrapper 클래스 & 오토박싱
- **exam31**: ArrayList & Collections
- **exam32**: Set 인터페이스 & Iterator
- **exam33**: Map 인터페이스 (HashMap)
- **exam34**: Comparator & Comparable (정렬)
- **exam35**: 제네릭 (Generics)
- **exam36-exam37**: 멀티스레딩 & 동기화
- **exam38-exam40**: 파일 I/O (바이트 스트림, 문자 스트림, 직렬화)

### 🎲 특별 프로젝트

#### 로또 번호 생성기
로또 번호 생성 시스템의 두 가지 구현 방식:

- **lottoExam**: 배열 기반 로또 시스템
  - 6개의 랜덤 번호(1-45) + 보너스 번호 생성
  - 사용자 입력 검증 & 중복 체크
  - 당첨 번호 비교 및 등수 판정

- **lottoExam2**: List 기반 로또 시스템
  - ArrayList를 활용한 동적 번호 관리
  - 향상된 중복 방지 로직

## 🛠️ 사용 기술

- **언어**: Java
- **IDE**: Eclipse
- **빌드 도구**: 수동 컴파일 (빌드 자동화 미사용)
- **Java 버전**: Java 8+ 호환

## 📂 프로젝트 구성

각 exam 폴더는 표준 Eclipse 프로젝트 구조를 따릅니다:
```
examXX/
├── src/           # 소스 코드
├── bin/           # 컴파일된 클래스 파일
├── .classpath     # Eclipse 클래스패스 설정
└── .project       # Eclipse 프로젝트 설정
```

## 🎓 주요 학습 성과

- ✅ Java 핵심 문법 및 프로그래밍 기초
- ✅ 객체지향 프로그래밍 원칙 (캡슐화, 상속, 다형성, 추상화)
- ✅ 자료구조 (배열, 리스트, 셋, 맵)
- ✅ 예외 처리 및 오류 관리
- ✅ 파일 입출력 작업
- ✅ 멀티스레딩 및 동시성 프로그래밍
- ✅ 제네릭 프로그래밍
- ✅ Java 컬렉션 프레임워크

## 🚀 실행 방법

1. 이 저장소를 클론합니다
2. Eclipse IDE에서 원하는 exam 프로젝트를 엽니다
3. main 메서드가 있는 클래스로 이동합니다
4. Java Application으로 실행합니다

## 📝 참고사항

- 각 프로젝트는 독립적으로 실행 가능합니다
- 주석은 주로 한국어로 작성되어 있습니다
- 코드는 다양한 Java 기능과 모범 사례를 보여줍니다
- 프로젝트는 기초부터 고급 개념으로 점진적으로 진행됩니다

## 📄 라이선스

이 프로젝트는 MIT 라이선스에 따라 라이선스가 부여됩니다. 자세한 내용은 [LICENSE](LICENSE) 파일을 참조하세요.

---

**참고**: 이것은 Java 프로그래밍 개념을 연습하기 위해 만든 개인 학습 저장소입니다.
