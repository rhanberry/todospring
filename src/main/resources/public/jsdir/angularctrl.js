var TodoListController = function($scope, $http) {

  $scope.editMode = false;
  $scope.position = '';

  $scope.resetTodolistField = function() {
    $scope.ab.taskitem = '';
    $scope.ab.taskdescription = '';
    $scope.ab.isComplete = '';
    $scope.editMode = false;
  };

  $scope.addTodolist = function(ab) {
    $http.post('todo/add', ab).success(function(response) {
      $scope.viewAllTodolist();
      $scope.ab.taskitem = '';
      $scope.ab.taskdescription = '';
      $scope.ab.isComplete = '';
    }).error(function(response) {
      console.log(response);
    });
  };

  $scope.updateTodolist = function(ab) {
    $http.put('todo/update', ab).success(function(response) {
      $scope.viewAllTodolist();
      $scope.ab.taskitem = '';
      $scope.ab.taskdescription = '';
      $scope.ab.isComplete = '';
    }).error(function(response) {
      console.log(response);
    });
  };

  $scope.deleteTodolist = function(id) {
    $http.delete('todo/delete/' + id).success(function(response) {
      $scope.viewAllTodolist();
    }).error(function(response) {
      console.log(response);
    });
  };

  $scope.editTodolist = function(pos, todothing) {
    $scope.position = pos;
    $scope.ab = todothing;
    $scope.editMode = true;
  };

  $scope.viewAllTodolist();

};
