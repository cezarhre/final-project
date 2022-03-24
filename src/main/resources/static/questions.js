    function showResults(){
        var q1 = document.quiz.questions.value;
        if(q1 == "opt3"){
          document.write("Corect");
          } else {
          document.write("Incorect")
          }
      };
    const myQuestions = [{
      question1: "Care este viteza maximă prevăzută de lege pentru circulaţia în zonele rezidenţiale?",
      answers: {
         opt1: "5 km/h;",
         opt2: "10 km/h;",
         opt3: "20 km/h;"},
        correctAnswer: "opt3"
      },
        {
      question2: "Este permisă oprirea voluntară a autovehiculului în tuneluri?",
      answers: {
         opt1: "da;",
         opt2: "nu;",
         opt3: "numai dacă lungimea tunelului depăşeşte 1000 m;"
      },
        correctAnswer: "opt2"
    }, {
      question3: "Pe autostradă se interzice:",
      answers: {
          opt1: "circulaţia autovehiculelor în coloană;",
          opt2: "învăţarea conducerii unui vehicul, încercarea prototipurilor de şasiuri şi de vehicule cu motor;",
          opt3: "executarea de lucrări pe partea carosabilă pe timp de noapte;"
      },
        correctAnswer: "b"
    }, {
      question: "În ce situaţie vă este permis să opriţi vehiculul sau să staţionaţi pe partea stângă a sensului de mers?",
      answers: {
          opt1: "pe drumurile cu sens unic, dacă rămâne liberă cel puţin o bandă de circulaţie;",
          opt2: "pe drumurile cu cel puţin două benzi pe sens;",
          opt3: "pe drumurile secundare;"
      },
        correctAnswer: "opt1"
    }
  ];



